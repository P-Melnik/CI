pipeline {
    agent any

    options {
        skipDefaultCheckout()
    }

    stages {
        stage('Checkout') {
            steps {
                script {

                    checkout scm
                }
            }
        }

        stage('Build and Test') {
            steps {
                script {

                    sh 'mvn clean install'
                }
            }
        }

        stage('Run SonarQube Analysis') {
            steps {
                script {

                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                script {

                    def tomcatUrl = 'http://localhost:9095'
                    def credentialsId = 'tomcat'

                    sh "mvn tomcat7:deploy -Dmaven.tomcat.url=${tomcatUrl} -Dmaven.tomcat.server=${credentialsId}"
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'

        }

        failure {
            echo 'Pipeline failed!'

        }
    }
}

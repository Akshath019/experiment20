pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Build WAR') {
            steps {
                dir('sample-webapp') {
                    bat 'mvn clean package'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('sample-webapp') {
                    bat 'docker build -t sample-webapp .'
                }
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8087:8080 sample-webapp'
            }
        }
    }
}

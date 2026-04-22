pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run') {
            steps {
                sh 'docker build -t cicd-app .'
                sh 'docker run -d -p 8087:8080 cicd-app'
            }
        }
    }
}

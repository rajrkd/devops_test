pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
               mvn build 
            }
        }
        stage('unit test') {
            steps {
               mvn package 
            }
        }
        stage('prod') {
            steps {
                echo 'Hello World from production'
            }
        }
    }
}


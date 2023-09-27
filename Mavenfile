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
               echo "test" 
            }
        }
        stage('prod') {
            steps {
                echo 'Hello World from production'
            }
        }
    }
}


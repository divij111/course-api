pipeline{
    agent any
    stages{
        stage('checking mvn version'){
            steps{
                bat 'mvn -v'
            }
        }
        stage('test'){
            steps{
                echo "Testing the application..."
            }
        }
        stage('deploy'){
            steps{
                echo "Deploying the application..."
            }
        }
    }
}

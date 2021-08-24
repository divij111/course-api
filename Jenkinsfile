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
                git 'https://github.com/Mausam.com.git'
            }
        }
        stage('deploy'){
            steps{
                echo "Deploying the application..."
            }
        }
    }
}

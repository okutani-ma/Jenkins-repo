pipeline{
    agent any

    tools {
        // Jenkinsの管理 > Toolsで定義した環境変数を指定
        jdk 'JDK25.0.2'
        maven  'Maven3.10.0'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/okutani-ma/Jenkins-repo.git/origin/*main'
            }
        }

        stage('Build') {
            steps {
                // cleanを実行し、キャッシュなどを削除
                bat 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                // MavenでJUnitテストを実行
                bat 'mvn test'
            }
        }
    }
}
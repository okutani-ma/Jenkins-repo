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
                git branch: 'main',
                url: 'https://github.com/okutani-ma/Jenkins-repo.git'
            }
        }

        stage('Build') {
            steps {
                // cleanを実行し、キャッシュなどを削除
                dir('my-app') {
                    bat 'mvn clean'
                }
            }
        }

        stage('Test') {
            steps {
                // MavenでJUnitテストを実行
                dir('my-app') {
                    bat 'mvn test'
                }
            }
        }
    }
}
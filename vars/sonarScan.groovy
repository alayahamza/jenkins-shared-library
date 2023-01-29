def call(Map config) {
    container('mvn-jdk8') {
        stage('SonarQube analysis') {
            withSonarQubeEnv('docker-env-sonar') {
                sh '''
                    mvn sonar:sonar
                '''
            }
        }
    }
}

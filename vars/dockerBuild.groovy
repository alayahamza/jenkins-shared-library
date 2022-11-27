def call(Map config) {
    
    stage('docker-build') {
        container('docker') {
            log('Docker build')
            sh"""
                pwd
                ls -lrt
                docker build -t "$config.tag" .
            """
        }
    }
}

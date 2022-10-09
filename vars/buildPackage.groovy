def call(Map config) {
    container('jenkins-slave') {
        git credentialsId: "$config.credentialsId", branch: "$config.branch", url: "$config.url"
    }

    container('jenkins-slave') {
        sh '''
                mvn clean install
        '''
    }
}

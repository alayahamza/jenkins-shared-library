class Git {

    def clone(String credentials, String branch, String url) {
        git credentialsId: credentials, branch: branch, url: url
    }

}

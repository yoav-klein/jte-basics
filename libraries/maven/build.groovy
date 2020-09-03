
def call() {
    stage('Maven: Build') {
        println "Build from the maven library"
        powershell script: 'echo "From powershell"'
    }
}

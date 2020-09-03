
def call() {
    stage('Maven: Build') {
        pipeline 
        {
            agent { label 'master' }
            stages
            {
                stage('First')
                {
                    echo "Step"   
                }
            }
        }
    }
}

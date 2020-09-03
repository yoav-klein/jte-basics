
def call() {
    stage('Maven: Build') {
        pipeline 
        {
           
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

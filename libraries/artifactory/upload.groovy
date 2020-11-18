
def call(def path) {
    println "Upload to ${path}"
    println "Upload source: ${pipelineConfig.artifacts_directory}"
    println "Get it from keywords: ${artifacts_directory}"
    println "From config: ${config.artifacts_directory}"
}

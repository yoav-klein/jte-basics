def call() {
  println "HERE"
  println config.artifacts
  config.artifacts.each { artifact ->
    println "ARtifact: $artifact"
  }
}

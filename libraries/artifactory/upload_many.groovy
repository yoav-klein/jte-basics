def call() {
  println "HERE"
  config.artifacts.each { artifact ->
    println "ARtifact: $artifact"
  }
}

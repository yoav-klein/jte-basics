
void call() {
    println config.getClass()
    println config.details.getClass()
    println config.details.messages.getClass()
    for(int i = 0; i < config.details.messages.size(); i++) {
        println config.details.messages[i]
    }
}
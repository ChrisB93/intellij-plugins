package ide.language.kotlin

object OneLine {
    val oneTypo = "It is <warning>friend</warning> of human"
    val fewTypos = "It <warning>are</warning> working for <warning>much</warning> warnings"
    val ignoreTemplate = "It is ${1} friend"
    val notIgnoreOtherMistakes = "It is <warning>friend</warning>. <warning>But</warning> I have a ${1} here"
}

object MultiLine {
    val oneTypo = """It is <warning>friend</warning> of human"""
    val fewTypos = """It <warning>are</warning> working for <warning>much</warning> warnings"""
    val ignoreTemplate = """It is ${1} friend"""
    val notIgnoreOtherMistakes = """It is <warning>friend</warning>. <warning>But</warning> I have a ${1} here"""
}

object InFunc {
    fun a(b: String) {
        a("It is <warning>friend</warning> of human")
        a("It <warning>are</warning> working for <warning>much</warning> warnings")
        a("It is ${1} friend")
        a("It is <warning>friend</warning>. <warning>But</warning> I have a ${1} here")
    }
}


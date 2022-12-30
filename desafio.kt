// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String, var idade: Int){
    
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
                
        this.inscritos.add(usuario)
        val msg =  "matriculado com sucesso"
        
        print(msg)
        	
        	
        
    }
}

fun main() {
    val conteudo = listOf(
    				ConteudoEducacional("Fundamentos", 20),
                    ConteudoEducacional("Princípios", 15)
                    )
    
    val formacao = Formacao("Kotlin", conteudo)
    
    val usuario = listOf(
    		Usuario("Maria", 24),
    		Usuario("Joao", 19)
            )
    val matricular = formacao.matricular(Usuario("Andre", 25))
    
    
}

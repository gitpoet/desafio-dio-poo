package br.com.dantas.desafioDioPoo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> consteudosConcluidos = new LinkedHashSet<>();

    public  void inscreverBootcamp(Bootcamp bootcamp){
        conteudosInscritos.addAll(bootcamp.getConsteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudoOptional = this.getConteudosInscritos().stream().findFirst();
        if(conteudoOptional.isPresent()){
            this.consteudosConcluidos.add(conteudoOptional.get());
            this.conteudosInscritos.remove(conteudoOptional.get());
        } else{
            System.err.println("Você não está matriculado em nehum curso");
        }
    }

    public double calcularTotalXp(){

        return this.consteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConsteudosConcluidos() {
        return consteudosConcluidos;
    }

    public void setConsteudosConcluidos(Set<Conteudo> consteudosConcluidos) {
        this.consteudosConcluidos = consteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(consteudosConcluidos, dev.consteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, consteudosConcluidos);
    }
}

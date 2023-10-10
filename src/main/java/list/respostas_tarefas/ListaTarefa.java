package main.java.list.respostas_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //Ideal quando tem tarefas repetidas
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            };
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesDeTarefas(){
        System.out.println(tarefaList);
    }



    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("correr");
        listaTarefa.adicionarTarefa("correr");
        listaTarefa.adicionarTarefa("comer");

        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("comer");
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesDeTarefas();

    }



}

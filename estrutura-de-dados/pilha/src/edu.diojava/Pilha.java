package edu.diojava;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha; // guardo minha referência de topo
        refNoEntradaPilha = novoNo; // seto minha nova referência como novo no
        refNoEntradaPilha.setRefNo(refAuxiliar); // novoNo recebe a referência de topo que era antes de adicionar novo no
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "=========================\n";
        stringRetorno += "  Pilha\n";
        stringRetorno += "=========================\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "=========================\n";
        return stringRetorno;
    }

}

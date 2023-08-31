package com.site.fundamentos.c_contratos_interfaces;

import com.site.fundamentos.c_contratos_interfaces.IControlador;

public class ControleRemoto implements IControlador {
  private Boolean ligado;
  private int volume;
  private Boolean tocando;

  public ControleRemoto () {
    this.ligado = false;
    this.volume = 50;
    this.tocando = false;
  }

  public void setLigar(int v) { this.ligado = true; }


    @Override
    public void ligar() {
        // TODO
    }

    @Override
    public void desligar() {
        // TODO
    }

    @Override
    public void abrirMenu() {
        // TODO
    }

    @Override
    public void fecharMenu() {
        // TODO
    }

    @Override
    public void maisVolume() {
        // TODO
    }

    @Override
    public void menosVolume() {
        // TODO
    }

    @Override
    public void ligarMudo() {
        // TODO
    }

    @Override
    public void desligarMudo() {
        // TODO
    }

    @Override
    public void play() {
        // TODO
    }

    @Override
    public void pause() {
        // TODO
    }
}

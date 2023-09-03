package com.site.experiencias.controle_remoto;

interface IControlador {
  void ligar();
  void desligar();
  void abrirMenu();
  void fecharMenu();
  void maisVolume();
  void menosVolume();
  void ligarMudo();
  void desligarMudo();
  void play();
  void pause();
  // já são abstract por padrão não precisa explicitar o abstract.

}
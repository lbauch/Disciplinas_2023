import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { FuncionarioService } from '../../funcionario.service';
import { Funcionario } from '../../funcionario';
import { FuncionarioComponent } from '../../funcionario/funcionario.component';

@Component({
  selector: 'app-app-cadastro2',
  standalone: true,
  imports: [CommonModule, FormsModule, FuncionarioComponent],
  templateUrl: './app-cadastro2.component.html',
  styleUrl: './app-cadastro2.component.css',
})
export class AppCadastro2Component implements OnInit{

  listaFuncionario: Funcionario[] = []

  constructor(private service: FuncionarioService) { }

  ngOnInit(): void {
    this.service.listar().subscribe((listaFuncionario) => {
      this.listaFuncionario = listaFuncionario})
  }
}

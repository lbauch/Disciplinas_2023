import { Funcionario } from './../funcionario';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-funcionario',
  standalone: true,
  imports: [],
  templateUrl: './funcionario.component.html',
  styleUrl: './funcionario.component.css'
})
export class FuncionarioComponent implements OnInit{
  
  @Input()
  funcionario: Funcionario = {
    id: 0,
    nome: '',
    foto: '',
    email: '',
    subobjeto: {
      propriedade1: '',
      propriedade2: ''
    }
  }
  
  ngOnInit(): void {
  }
}

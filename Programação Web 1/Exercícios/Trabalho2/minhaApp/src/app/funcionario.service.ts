import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario } from './funcionario';

@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {

  private readonly funcionariosJson = '../../assets/exemploJSON.json';
  constructor(private http: HttpClient) { }

  listar(): Observable<Funcionario[]>{
    return this.http.get<Funcionario[]>(this.funcionariosJson);
  }
}

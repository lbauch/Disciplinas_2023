import { Routes } from '@angular/router';
import { AppHomeComponent } from './view/app-home/app-home.component';
import { AppCadastro2Component } from './view/app-cadastro2/app-cadastro2.component';

export const routes: Routes = [
  {
    path: '',
    component: AppHomeComponent
  },
  {
    path: 'cadastro2',
    component: AppCadastro2Component
  },
];

import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AppHeaderComponent } from './view/app-header/app-header.component';
import { AppFooterComponent } from './view/app-footer/app-footer.component';
import { AppNavComponent } from './view/app-nav/app-nav.component';
import { FuncionarioComponent } from './funcionario/funcionario.component';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,
    AppHeaderComponent,
    AppFooterComponent,
    AppNavComponent,
    FuncionarioComponent,
    HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'minhaApp';
}

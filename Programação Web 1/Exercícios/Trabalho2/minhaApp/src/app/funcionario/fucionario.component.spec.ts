import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FuncionarioComponent } from './funcionario.component';

describe('AppCadastro2Component', () => {
  let component: FuncionarioComponent;
  let fixture: ComponentFixture<FuncionarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FuncionarioComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FuncionarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
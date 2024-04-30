import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AgregarEquipoPage } from './agregar-equipo.page';

describe('AgregarEquipoPage', () => {
  let component: AgregarEquipoPage;
  let fixture: ComponentFixture<AgregarEquipoPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(AgregarEquipoPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

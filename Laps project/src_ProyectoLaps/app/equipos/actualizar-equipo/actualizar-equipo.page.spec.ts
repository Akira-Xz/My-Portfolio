import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActualizarEquipoPage } from './actualizar-equipo.page';

describe('ActualizarEquipoPage', () => {
  let component: ActualizarEquipoPage;
  let fixture: ComponentFixture<ActualizarEquipoPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(ActualizarEquipoPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

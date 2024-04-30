import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { InfoIdPage } from './info-id.page';

const routes: Routes = [
  {
    path: '',
    component: InfoIdPage
  },
  {
    path: 'agregar-equipo',
    loadChildren: () => import('./agregar-equipo/agregar-equipo.module').then( m => m.AgregarEquipoPageModule)
  },
  {
    path: 'actualizar-equipo',
    loadChildren: () => import('./actualizar-equipo/actualizar-equipo.module').then( m => m.ActualizarEquipoPageModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class InfoIdPageRoutingModule {}

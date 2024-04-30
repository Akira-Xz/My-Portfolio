import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'login',
    loadChildren: () => import('./login/login.module').then( m => m.LoginPageModule)
  },
  {
    path: 'info-pc',
    loadChildren: () => import('./equipos/info-pc/info-pc.module').then( m => m.InfoPcPageModule)
  },
  {
    path: 'info-id',
    children:[{
      path: '',
      loadChildren: () => import('./equipos/info-id.module').then( m => m.InfoIdPageModule)
    },{
      path: ':id_equipo',
      loadChildren: () => import('./equipos/info-pc/info-pc.module').then( m => m.InfoPcPageModule)
    }]
  },
  {
    path: 'newEquipo',
    loadChildren: () => import('./equipos/agregar-equipo/agregar-equipo.module').then( m => m.AgregarEquipoPageModule)
  },
  {
    path: 'update/:id_equipo',
    loadChildren: () => import('./equipos/actualizar-equipo/actualizar-equipo.module').then( m => m.ActualizarEquipoPageModule)
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

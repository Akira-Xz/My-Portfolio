import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ActualizarEquipoPageRoutingModule } from './actualizar-equipo-routing.module';

import { ActualizarEquipoPage } from './actualizar-equipo.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ActualizarEquipoPageRoutingModule
  ],
  declarations: [ActualizarEquipoPage]
})
export class ActualizarEquipoPageModule {}

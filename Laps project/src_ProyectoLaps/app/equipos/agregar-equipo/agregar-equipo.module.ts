import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { AgregarEquipoPageRoutingModule } from './agregar-equipo-routing.module';

import { AgregarEquipoPage } from './agregar-equipo.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    AgregarEquipoPageRoutingModule
  ],
  declarations: [AgregarEquipoPage]
})
export class AgregarEquipoPageModule {}

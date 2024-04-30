import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { InfoPcPageRoutingModule } from './info-pc-routing.module';

import { InfoPcPage } from './info-pc.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    InfoPcPageRoutingModule
  ],
  declarations: [InfoPcPage]
})
export class InfoPcPageModule {}

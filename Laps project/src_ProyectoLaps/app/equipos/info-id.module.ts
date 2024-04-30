import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { InfoIdPageRoutingModule } from './info-id-routing.module';

import { InfoIdPage } from './info-id.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    InfoIdPageRoutingModule
  ],
  declarations: [InfoIdPage]
})
export class InfoIdPageModule {}

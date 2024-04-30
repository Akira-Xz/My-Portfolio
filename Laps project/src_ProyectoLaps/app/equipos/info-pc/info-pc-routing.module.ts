import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { InfoPcPage } from './info-pc.page';

const routes: Routes = [
  {
    path: '',
    component: InfoPcPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class InfoPcPageRoutingModule {}

import { Component, OnInit } from '@angular/core';
import { LapsService } from '../../laps.service';
import { ActivatedRoute, Router } from '@angular/router';
import { AlertController } from '@ionic/angular';

@Component({
  selector: 'app-info-id',
  templateUrl: './info-id.page.html',
  styleUrls: ['./info-id.page.scss'],
})
export class InfoIdPage implements OnInit {

  constructor(
    private minfoPcService : LapsService,
    private activatedRoute : ActivatedRoute,
    private router : Router,
    private alertCtrl: AlertController
  ) { }
  equipos : any = []

  ngOnInit() {
    this.obtenerEquipos();
  }
  ionViewWillEnter(){
    this.minfoPcService.getLaps().subscribe(data => {
      this.equipos = data;
      console.log(this.equipos);
    })
  }
  obtenerEquipos() {
    this.minfoPcService.getLaps().subscribe((res:any)=>{
      this.equipos = res;
      console.log(this.equipos);
    })
  }
  agregarEquipo(){
    this.router.navigate(['/newEquipo']);
  }
  async eliminarEquipo(id:any){
    const alert = await this.alertCtrl.create({
      header: 'Confirmar',
      message: '¿Estas seguro de eliminar este registro?',
      buttons: [
        {
          text: 'Cancelar',
          role: 'cancel',
          cssClass: 'secondary',
          handler: (blah) => {
            console.log('Confirm Cancel: blah');
          }
        }, {
          text: 'Eliminar',
          handler: () => {
            this.minfoPcService.deleteLap(id).subscribe((res:any)=>{
              console.log(res);
              this.obtenerEquipos();
            })
          }
        },
      ]
    });

    await alert.present();
  }

}

import { Component, OnInit } from '@angular/core';
import { LapsService } from '../../../laps.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-info-pc',
  templateUrl: './info-pc.page.html',
  styleUrls: ['./info-pc.page.scss'],
})
export class InfoPcPage implements OnInit {

  constructor(
    private minfoPcService : LapsService,
    private activatedRoute : ActivatedRoute,
  ) { }
  equipos : any = []

  ngOnInit() {
    this.activatedRoute.paramMap.subscribe(paramMap => {
      const id_equipo = paramMap.get('id_equipo');
      this.obtenerEquipo(id_equipo);
    })
  }
  obtenerEquipo(id_equipo:any){
    this.minfoPcService.getLap(id_equipo).subscribe((res:any)=>{
      this.equipos = res[0];
      console.log(this.equipos);
    })
  }

}

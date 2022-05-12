import { Component, OnInit } from '@angular/core';
import { Activite } from 'src/app/models/activite.model';
import { ActiviteService } from 'src/app/services/activite.service';

@Component({
  selector: 'app-nouveau-programme',
  templateUrl: './nouveau-programme.component.html',
  styleUrls: ['./nouveau-programme.component.css']
})
export class NouveauProgrammeComponent implements OnInit {

  activite: Activite = {
    id :'',
    nom: '',
    materiel: '' ,
    difficulte:'' ,
    muscle_primaire:'',
    muscle_secondaire:'',
    duree: 4
  };
  submitted = false;
  constructor(private activiteService: ActiviteService) { }
  ngOnInit(): void {
  }
  saveActivite(): void {
    const data = {
      id: this.activite.id,
      nom: this.activite.nom,
      materiel: this.activite.materiel,
      difficulte: this.activite.difficulte,
      muscle_primaire: this.activite.muscle_primaire,
      muscle_secondaire: this.activite.muscle_secondaire,
      duree: this.activite.duree,
    };
    this.activiteService.create(data)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;
        },
        error => {
          console.log(error);
        });
  }
  newActivite(): void {
    this.submitted = false;
    this.activite = {
    id :'1',
    nom: 'developpe couche haltere',
    materiel: 'halt' ,
    difficulte:'' ,
    muscle_primaire:'',
    muscle_secondaire:'',
    duree: 4
    };
  }
}

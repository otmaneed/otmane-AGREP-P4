import { TableListComponent } from './components/table-list/table-list.component';
import { SignUpComponent } from './registre/sign-up/sign-up.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { FormulaireComponent } from './components/formulaire/formulaire.component';
import { ReceptionisteComponent } from './components/receptioniste/receptioniste.component';
import { UserComponent } from './components/user/user.component';
import { SyntheseComponent } from './components/synthese/synthese.component';
import { SpecialiteComponent } from './components/specialite/specialite.component';
import { RoleComponent } from './role/role.component';
import { RendezVousComponent } from './components/rendez-vous/rendez-vous.component';
import { PracticienComponent } from './components/practicien/practicien.component';
import { PatientComponent } from './components/patient/patient.component';
import { DossierMComponent } from './components/dossier-m/dossier-m.component';
import { CommunicationComponent } from './components/communication/communication.component';
import { AutreResourceComponent } from './components/autre-resource/autre-resource.component';
import { AdministrationComponent } from './components/administration/administration.component';
import { AuthComponent } from './components/auth/auth.component';
import { InfermierComponent } from './components/infermier/infermier.component';
import { MedcinComponent } from './components/medcin/medcin.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthentificationGuard } from './helpers/authentification.guard';



const routes: Routes = [
  { path: '', canActivate: [AuthentificationGuard], component: TableListComponent },
  { path: 'sign-up', component: SignUpComponent },
  { path: 'sign-in', component: SignInComponent },
  { path: 'role', canActivate: [AuthentificationGuard], component: RoleComponent },

  { path: "auth", canActivate: [AuthentificationGuard], component: AuthComponent },
  { path: "administration", canActivate: [AuthentificationGuard], component: AdministrationComponent },
  { path: "autre-resource", canActivate: [AuthentificationGuard], component: AutreResourceComponent },
  { path: "communication", canActivate: [AuthentificationGuard], component: CommunicationComponent },
  { path: "dossier-m", canActivate: [AuthentificationGuard], component: DossierMComponent },
  { path: "patient", canActivate: [AuthentificationGuard], component: PatientComponent },
  { path: "practicien", canActivate: [AuthentificationGuard], component: PracticienComponent },
  { path: "rendez-vous", canActivate: [AuthentificationGuard], component: RendezVousComponent },
  { path: "role", canActivate: [AuthentificationGuard], component: RoleComponent },
  { path: "specialite", canActivate: [AuthentificationGuard], component: SpecialiteComponent },
  { path: "synthese", canActivate: [AuthentificationGuard], component: SyntheseComponent },
  { path: "user", canActivate: [AuthentificationGuard], component: UserComponent },
  { path: "receptioniste", canActivate: [AuthentificationGuard], component: ReceptionisteComponent },
  { path: "medcin", canActivate: [AuthentificationGuard], component: MedcinComponent },
  { path: "infermier", canActivate: [AuthentificationGuard], component: InfermierComponent },
  { path: "formulaire", canActivate: [AuthentificationGuard], component: FormulaireComponent },
  { path: "**", canActivate: [AuthentificationGuard], component: PageNotFoundComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents = [MedcinComponent, InfermierComponent, FormulaireComponent, AuthComponent, ReceptionisteComponent, PageNotFoundComponent, AdministrationComponent, AutreResourceComponent, CommunicationComponent, RoleComponent, UserComponent, SyntheseComponent, SpecialiteComponent, RendezVousComponent, PracticienComponent, PatientComponent, DossierMComponent] 

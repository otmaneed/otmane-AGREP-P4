import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthentificationService } from '../services/authentification.service';


@Injectable({
  providedIn: 'root'
})

export class  AuthentificationGuard implements CanActivate {
  constructor(private _router: Router,private _authenticatService: AuthentificationService){}
  canActivate(): boolean {
    if (this._authenticatService.loggedIn()) {
      console.log('true')
      return true
    } else {
      console.log('false')            
      this._router.navigate(['/sign-up'])
      return false
    }
  }

  
}

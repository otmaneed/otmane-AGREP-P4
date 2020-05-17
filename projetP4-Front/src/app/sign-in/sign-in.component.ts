
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { AuthentificationService } from '../services/authentification.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.scss']
})
export class SignInComponent implements OnInit {
  token:any;
  loginForm = this.formBuilder.group({
  username: ['', Validators.required],
  password: ['', Validators.required],
  });
  constructor(
    private formBuilder:FormBuilder,
    private authenticationService:AuthentificationService,
    private _router: Router,
    ) { }
    ngOnInit() {
    }
  onSubmit() {
    console.log(this.loginForm.value)
    this.authenticationService.login(this.loginForm.value)
      .subscribe(
        res=>{

        console.log(res);
        this.token = res['token'];
        localStorage.setItem('token', this.token)
        this._router.navigate(['/dashboard'])
      },
      err => console.log(err)
      )
    }

}

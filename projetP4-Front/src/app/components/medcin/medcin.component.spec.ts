import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MedcinComponent } from './medcin.component';

describe('MedcinComponent', () => {
  let component: MedcinComponent;
  let fixture: ComponentFixture<MedcinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MedcinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MedcinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

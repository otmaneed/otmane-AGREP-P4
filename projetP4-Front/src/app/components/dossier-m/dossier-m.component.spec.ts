import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DossierMComponent } from './dossier-m.component';

describe('DossierMComponent', () => {
  let component: DossierMComponent;
  let fixture: ComponentFixture<DossierMComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DossierMComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DossierMComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

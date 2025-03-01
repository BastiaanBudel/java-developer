import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculatePensionComponent } from './calculate-pension.component';

describe('CalculatePensionComponent', () => {
  let component: CalculatePensionComponent;
  let fixture: ComponentFixture<CalculatePensionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CalculatePensionComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CalculatePensionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

//
//  CalculatorModule.swift
//  Calculator
//
//  Created by 김태현 on 2023/02/26.
//

import Foundation

@objc(CalculatorModule)
class CalculatorModule: NSObject {
  
  @objc(executeCalc:numberA:numberB:resolver:rejector:)
  public func excuteCalc(_ action: String, numberA: Int, numberB: Int,
                             resolver: RCTPromiseResolveBlock, rejector: RCTPromiseRejectBlock) -> Void {
    if (action == "plus") {
      resolver(numberA + numberB);
      return;
    }
    
    if (action == "minus") {
      resolver(numberA - numberB);
      return;
    }
    
    if (action == "multiply") {
      resolver(numberA * numberB);
      return;
    }
    
    if (action == "divide") {
      resolver(numberA / numberB);
      return;
    }
    
    rejector("unexpected action type", action, nil);

  }
  
}

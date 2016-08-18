# react-native-shortcutbadger
A React Native Moulde of ShortcutBadger that makes your Android app show the count of unread messages as a badgeon your App shortcut!

The ShortcutBadger of Android Native which Version is V1.1.8.

ShortcutBadger: https://github.com/leolin310148/ShortcutBadger.

# Support launchers
Takes look at ShortcutBadger.

# USAGE
1.In your `android/settings.gradle` file, make the following additions:
```
include ':react-native-shortcutbadger'
project(':react-native-shortcutbadger').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-shortcutbadger/android')
```

2.In your `android/app/build.gradle` file, add the `:react-native-shortcutbadgerproject` as a compile-time dependency:
```
...
dependencies{
    ...
    compile project(':react-native-shortcutbadger')
}
...
```

3.Update `MainActivity.java` to use shortcutbadger via the following changes
```
import com.yangqiong.shortcutbadger.ShortcutBadgerPackage;

public class MainActivity extends ReactActivity {
    ...
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new ShortcutBadgerPackage()     // new
        );
    }
    ...
}
```